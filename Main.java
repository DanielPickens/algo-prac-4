class PhoneNumber implements Comparable<PhoneNumber> {

    private Long number;

    public PhoneNumber(Long number) {
        this.number = number;
    }

    public Long getNumber() {
        return this.number;
    }

    public boolean equals(Object object) {

        if (getNumber() == null && object == null) {
            return true; //or false its depend 
        }

        return getNumber().equals(object);
    }

    public int compareTo(PhoneNumber that) {

            if(that == null) {
             return -1;
            }

        Long thisNumber = getNumber();
            Long thatNumber = that.getNumber();

        if (thisNumber == null && thatNumber == null) {
            return 0; //or -1
        }

        if (thisNumber == null && thatNumber != null) {
            return -1;
        }

        return thisNumber.compareTo(thatNumber);

    }

// Drives
    public String toString() {
        return String.format("%010d", getNumber());
    }
}
