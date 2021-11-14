package DefangingAnIPAddress;

public class defangingAnIPAddress {
        public String defangIPaddr(String address) {
            return address.replace(".", "[.]");
        }
    }
