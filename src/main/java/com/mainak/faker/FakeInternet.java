package com.mainak.faker;

public class FakeInternet {
    // Function to generate fake domain name
    public String domainName() {
        String[] domains = {"example.com", "testsite.org", "mywebsite.net", "sample.co", "demo.io", "fakesite.biz", "mockdomain.info", "placeholder.us", "temporal.uk", "dummy.ca", "sample.info", "fakesite.xyz", "mockdomain.online", "placeholder.tech", "temporal.site", "dummy.store", "example.app", "testsite.dev", "mywebsite.cloud", "sample.space", "samplewebiste.in"};
        return domains[(int) (Math.random() * domains.length)];
    }

    // Function to generate fake ipv4 address
    public String ipv4Address(){
        StringBuilder ipv4 = new StringBuilder();
        ipv4.append((int)(Math.random() * 255)).append(".");
        ipv4.append((int)(Math.random() * 255)).append(".");
        ipv4.append((int)(Math.random() * 255)).append(".");
        ipv4.append((int)(Math.random() * 255));
        return ipv4.toString();
    }

    // Function to generate fake ipv6 address
    public String ipv6Address(){
        StringBuilder ipv6 = new StringBuilder();
        for(int i=0; i<8; i++) {
            final String hexString = Integer.toHexString((int) (Math.random() * 0xFFFF));
            if(hexString.length() < 4) {
                // Pad with leading zeros to ensure 4 digits
                ipv6.append("0".repeat(4 - hexString.length()));
            }
            ipv6.append(hexString);
            if(i != 7) ipv6.append(":");
        }
        return ipv6.toString();
    }

    // Function to generate fake mac address
    public String macAddress(){
        StringBuilder mac = new StringBuilder();
        for(int i=0; i<6; i++) {
            String hexString = Integer.toHexString((int) (Math.random() * 255));
            if(hexString.length() == 1) hexString = "0" + hexString; // Ensure two digits
            mac.append(hexString);
            if(i != 5) mac.append(":");
        }
        return mac.toString();
    }

    // Function to generate fake urls
    public String url(){
        String[] protocols = {"http", "https"};
        String[] paths = {"/home", "/about", "/contact", "/products", "/services", "/blog", "/faq", "/terms", "/privacy", "/support"};
        String protocol = protocols[(int) (Math.random() * protocols.length)];
        return protocol + "://" + domainName() + paths[(int) (Math.random() * paths.length)];
    }


}
