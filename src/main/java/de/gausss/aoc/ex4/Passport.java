package de.gausss.aoc.ex4;

import java.util.Arrays;
import java.util.stream.Collectors;

public record Passport(String id, String birth, String issued, String expiration, String height, String hair,
                       String eye, String country) {

    /**
     * pid (Passport ID)
     * byr (Birth Year)
     * iyr (Issue Year)
     * eyr (Expiration Year)
     * hgt (Height)
     * hcl (Hair Color)
     * ecl (Eye Color)
     * cid (Country
     */
    public static Passport fromString(String serializedData) {
        var passport = Arrays.stream(serializedData.split("\\s"))
                .map(infoString -> {
                    String[] infoSplit = infoString.split(":");
                    return new Tuple(infoSplit[0], infoSplit[1]);
                }).collect(Collectors.toMap(Tuple::first, Tuple::last));

        return new Passport(passport.get("pid"), passport.get("byr"),
                passport.get("iyr"), passport.get("eyr"), passport.get("hgt"),
                passport.get("hcl"), passport.get("ecl"), passport.get("cid"));
    }

    public boolean isValid() {
        return this.id != null && this.birth != null && this.issued != null
                && this.expiration != null && this.height != null
                && this.hair != null && this.eye != null;
    }
}
