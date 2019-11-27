/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

/**
 * @author zhongyu
 * @version $Id: TestAccount.java, v 0.1 2019年09月05日 上午11:32 zhongyu Exp $
 */
public class TestAccount {
    public static final String NOT_SET_KEY_APP_ID = "2019092567661029";

    public static class Sandbox {
        public static final String GATEWAY           = "https://openapi.alipaydev.com/gateway.do";
        public static final String UNTRUSTED_GATEWAY = "https://121.0.26.96/gateway.do";
        public static final String ALIPAY_PUBLICKEY
                                                     =
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnAUxtW3XiajFkyIpf0psiSorGpVGTWAEkbOGcJXtgoVUr42wBsbGI91X0z9tlMubrjb"
                        + "/rsi4b9A1plS4L6SkbB6/jplDbCE5WY5LPb9MsbBNYgHxL4RCL5NLvSM0W19iOq5jkj4tJtjn7+EOUSLHsSLqtu7HIlvN"
                        + "/prxOYNj8RdXhUKRyzqNXnLZYdbWoiyzKfF2Epdp4It/cSjHsODu1+WqSHU1xqpTyh4tHASDFpNK0pOaPjGJl7HR0O"
                        + "/BLQjwIRdxk3OmrSPb5cTn7q2z+hK4O3Dh8qK606KDMReveZN0uOvS2CuH62nxZKoEJmujR7vEY0lHk/xgv0TqKXpt4QIDAQAB";
        public static final String APP_ID            = "2016092700607517";
        public static final String APP_PRIVATE_KEY
                                                     =
                "MIIEwAIBADANBgkqhkiG9w0BAQEFAASCBKowggSmAgEAAoIBAQC1Dqk4+bim3zsdrsAa0wJQzyC/8jQvvjS1pCwvlEDvbipIuGRPN"
                        +
                        "/iN5WNb2SIgYmepQq88xkSkJMBu4t8xMwCVhvDGqMJFxcjAfHQLU3FJ2Hagrm8jQdLX5CTUlRnHJkoxQ0yZD2xsPs1TJOTSVeYqAZtQYeV7RwAXeOIfKBPaUFxZqA7zeRPv0HziNZTy7wRmO7qDKPmecLfxwrDkX15LFXJlT+zfEWGPA4mncYd8M/G3bXeG/hA4Pgz7YOhO4lHEpix1h2PGkKymsFvYtdB5fGZW8mrIoMnxTAVEvG/WWLdSJWvemoQLedDMPdgBQxuXw9jfd/dl1BKInaqbK8RnAgMBAAECggEBAKq43E/hCIAw1akzcejZNsHDzPmxBAxQqZrs5s0mWeRqWGyhkdQwzqndtkaRA2DN6TjsrBf+TBMKpHjqa9IUaWSVDMwFrMnlqVn2/+T+FUCwX4s7b4grNQhlE2VwAhKKxEKXVs6sgGvA/BJ+I1VBsfnB8hVleeE4HZoEXhNK0w1ySmTX1H+zzpMxWlwSDyieoWfjnc1S1iQRDLl4ROXJJCrBIYKJDOZ61hxGYvBDKqiebs+yMvjON4b2oxGba2CK4llQzeDVlA+Zl4AAx6OElSTIso8wShEVW1KfCPkdAocvfY6ZlVsKkEdgVDINtyTiQDpjBqb3EAESBENGNKm94yECgYEA4f8KiRROrQoaetUWA/2zO7FragJs3R8eQ4rOtHIPDWtezWqJaAtnApUlQiTXAOX2MrxSG/9MBqpXzzk80BNJyMBErCNSbXEtcl+EnY21V8bxP1WLzabbhORV/InvePci8PocbhIcv5o3R/wnvDJxW6Bd7gsaPFAxakeO0bLBqesCgYEAzRhGFzLDZ+mKAaoLr0VpWEwQ/9EEWFJrQfecWcfPUmYYl6y70QmFbr0JDSumEDk9/zdre27ErYyU0jr6/tBGYe0WBnhnjHmv4yBYPK0VJh7GgttousmmdpSVA73Gb964nRMFnHXPfyLLm887vFEohpid+LUflBwbK4m+Q7S4VHUCgYEA3Be22fNF/+2UBkYZj792206ZTn+YJ+0TWzIGxuNB147Wn/T+Zq6cHn7D71vTbBOJJrYSvSNvlho1NCIJIJd4RyNAfehUcTNE0FtH2uzUS+z6q/STF7BFn3GEcFKhPsxoYgkiwOuwxcTZy6g9xmHV1ici8x4q6cwro9aWt5CAXQsCgYEAwTpaZubTxWX5OQItig9aZe8coPgbIN9d4EPaUZf300kPaG88cICI70E4cukpxuU3bOmY4S0GLgBiAgPBkCtH9GD7vFLaNDY9qT5DA7+KSmT6YDU5Yao0pEnubxzwBVwQESTnx3YTbVOqAvzm6dCI3u6Q/s4el1s3mfhngsCUXjUCgYEAyvfC8y3hrUOuuEVzgr9YbMbk2zoygcCXT97segZLKvHlT6H8CFeF7XLUCzTXziNKjoO2/idMt95K/PENzdqVpEGCSQqMp3sZEdctMOJvj193qzR6n/D8Pj/A2G83uz2IKn4TPgkambkGemDC4KbFdjiwFAieuLovhY3ac/qWobU=";
        public static final String AES_KEY           = "hNtPqVWeuUeEpw9ksTZ92A==";
    }

    public static class DevLoadTest {
        public static final String GATEWAY = "http://openapi.stable.alipay.net/gateway.do";
        public static final String ALIPAY_PUBLICKEY
                                           =
                "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";
        public static final String APPID   = "2021000100600007";
        public static final String APP_PRIVATE_KEY
                                           =
                "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKUkTROQQ/FMtYXn6nWHzawNbRQSbF3rGhTGiCm+M2pxrGBfW6WI0D3VQLW8G7eb+6Xs2"
                        + "+FPp/+FO3MuYpbpNsDp3fSwXU/WjcEx8HBS43WO6Fr+5/STxbles+OB/Pyak29Z/IErjJK/kd7H/oCWg6DJLaw"
                        + "+6lXsadZgel8iJBrdAgMBAAECgYBTm5laOkPrusZ8UPonHuZGIVYEP3+V3R2LPyhY2e72CS8Ya67ek/G6HGlymRX/U32Id"
                        + "+6ql8WaXD3JBsbrWI9bMP8Bg34o966+uurZL6hEnF08Xgz7gQ7sO00/K6WJHO"
                        + "+F98DQfODQG11cZ5QR5kDejA7twAQfqKyHnDSWFEhhAQJBAPKX4p6CaaKywE+0V0NuC8k3YSLDZL"
                        + "+mmToMW9Fzjq6OfzpseCTe6Kzm0uzX3jkIXnV6L2cta65Uu48OGnWUENECQQCuRKmVLN10VA5rV6A/UHgmJs0lfcWTC7v6m"
                        + "+goPrTqkFmVjqzrwbeO6DdtCCGXU4iXrbu/X5dHhlXKI1LlDUxNAkBxznFA"
                        + "/VtDOWpgufDKMGEVF4bZQSMNicGOaufUPcrs9uqW5PYEDhLHsk23UJnu1Y9Cu3xrgfJnSVboCKy/BiRRAkAcl9V"
                        + "/TXI0gQowoJsBaHGeSOWGDkHZo6Y/M09/MvK6Pd8FA/jpYcp9Xyqg8CGa07Doui/A8a0"
                        + "/phHzbaJPRMRNAkEApoXZ3ys8LmBbMvECjFA7wbgQAfTRYyXJcY8Gv3wJW1RN9+VwdDakrf1LLXmB21BNDRYi9RrJ9p4VlDkvady6Bg==";
    }

    public static class ProdCert {
        public static final String GATEWAY = "https://openapi.alipay.com/gateway.do";
        public static final String APP_ID  = "2019091767145019";
        public static final String APP_PRIVATE_KEY
                                           =
                "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCO5ajRITPs5rqH3bsMUQvx3gHGFtUtf2JqERBe9RFdm7eMXsXLNKd4TxhMTNSF7q"
                        + "+xxGX3NY7Kvu1NpIUaDRFbGnQWTLFT07XN2oroh1jf4FIkm+LjP4ZwEUElLdTO5hF8aSUc9JFibElKo3MdgaL7tNHBhWyGRl7/x"
                        + "/OkMwXz6UXfagE99K30omW9wo7YnlTE6utMJliHXfP9a2aRsvhBFwRhpFzkKBkwYFF6H0CM8K1ooAEzbf"
                        + "/jYMetLjjTHiUy5NUWKPtRf1doljYLBAqoVOtvN4kOknI5lIazlVbodtEzkmhcdsXMzQtQsOaj"
                        + "/oRrSE52LhiEw1cUoaNZPtOFAgMBAAECggEAYwQ4alE7jdiDQEogpnQydrKDQCPqK9Cs"
                        + "/Ro94c6m7dpM4XN6U0h1EySbjaNfUD8Id4HDtfziqRKLlNV/dYHAmQRHlHwoFBILVE0vG9lNeDQUN1HdceI"
                        + "+4cDTB1Qutf8t9qtVEC9X3n9yecmwpq2BpjCxeAtgG9r/UPXYmdrRMSVWGp/bpGjmbhm1EtEtCPKjkzSC0WdALvFosK1xnjHFwCcT"
                        + "+R4r2N7GKE0HyvjP0PQFRuR4/7oA4MuLhgzLfxbeWS8sDci1PhW7PolSVb1jp0v7HQ85qtx3NCgezBqAc+OtpmM3ZN"
                        + "/DUz062IxJFs9Rhl77PiRyJegULSuOBoYtsQKBgQDFDThfBLzByYCV7Oca5IUODyT7wiKBUhC6qBuNWmfEsGfGMw06d2twemFG98"
                        + "/KBDV8kcYGK5XL/6dpsPDEZFPV65vc7A9f2KnglaFyaPKduA8msRaxxLp5Oj/Nwuvnd0rTL2TPK0t8JH1oo8LDdAvh449P89yzTqB3L8"
                        + "+ioq7XTwKBgQC5pSE0hUYFsx/9bgMHB4PuN4r1WJNhGy5J5SQABmklnnUWiiCtt0rE23//tT7UICB4AqePt"
                        +
                        "+Qa7zjEjV1DTIZccmPuX2yje9ayZbPXJLJT"
                        +
                        "/tGawBlzuO5aLjbfkMDQy67nV8NE8rZ7c5aQLNsv3XA1fucwLauc2XJkvwHJ88Jy6wKBgQC5hhvn4ibxcQ0emwBvom3fccTJP9uK1EAp7TKboF2IounhgplWza6bJK3HynOZaOMO2JSPpKORgK8XZF8bGLaR9xU1KA/FltFCQL7TYBnlArFJJXwPfQBwOLZvvLCsqfUJ5lpMbx/Pzu9AAMbTjMPPNpfsl9XYABQ2gw5DulVRIwKBgF0x7I11KkXKOpD7HUH2H+ECuRuZr8Lb5kzqXzwz+60K8zSxet46WaqhloxD7JqI1kPo8T1Qz45F8XWakesrC3h1ZH1SIjOgA5PjQnkKzwsjrQ3GygAyIlXbRWjOPj2TQuaYRErknX8z863FFvPccmwonN6uzqwa7TZuPPOpD0CpAoGAG8HpnPrWT93skha2o9CT2ISnptlAts6a2wcMGrKgM77zQiFpR/P/eHcJTyJdlp8ap6sEGIwQM430CqR41Za/0L/uRkbGi2gjBcdz+2OlyvsWIhPAWAGqI4lYB7K/NWtzSBvI8Zdzw4brAgH9GrbIBqd/VV81KXf13kBnsRjBwA0=\n";

        public static final CertAlipayRequest CERT_PARAMS = getCertParams();

        public static CertAlipayRequest getCertParams() {
            CertAlipayRequest certParams = new CertAlipayRequest();
            certParams.setServerUrl(TestAccount.ProdCert.GATEWAY);
            certParams.setAppId(TestAccount.ProdCert.APP_ID);
            certParams.setPrivateKey(TestAccount.ProdCert.APP_PRIVATE_KEY);
            certParams.setFormat("json");
            certParams.setCharset("utf-8");
            certParams.setSignType("RSA2");
            certParams.setCertPath("src/test/resources/fixture/appCertPublicKey_2019091767145019.crt");
            certParams.setAlipayPublicCertPath("src/test/resources/fixture/alipayCertPublicKey_RSA2.crt");
            certParams.setRootCertPath("src/test/resources/fixture/alipayRootCert.crt");
            return certParams;
        }
    }

    public static class ProdLife {
        public static final String GATEWAY = "https://openfile.alipay.com/chat/multimedia.do";
        public static final String ALIPAY_PUBLICKEY
                                           =
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0MYezLBe27D8kJU6CVjj5Zhn6lHq2SNqNu9uS1Kq2mxmDmgIMWvDgJurBV6Kuk8pEZbSARJgI2IzGLnUHpcMUr/DYUNXixBa2O6Nmd00PsvJb5S5r6lpxDMzqquBXFDeoM3dZ4rLBlbc1JJsfRKwfvPYOlgCldWxQmQUByI83zCKnGZHXVGeEopLDCgf53ChTiTyX9glCIt9VEZ8t1pSKAuOIxtUol9rDynW5G7EhkHA3xiKTUUATScZV1//GPA+0axQlh7Y4eDjUjE9vfsY0vBzTNIEkdsuECl8kbqV6zWPck07ZD4UCBI30o7ED57jPt2+1RXdxkg3A277JDUTSwIDAQAB";
        public static final String APPID   = "2019051064521003";
        public static final String APP_PRIVATE_KEY
                                           = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCC80FnoMeLpQTdE4vHTWL8ys/X6KVlg"
                + "+bkE7x/ZvB7FzjBcWYGiqpqz0PlslEgMVoYVQWMvgeIW6sdB2YoxdAPeOyBCsFKhL6gLc/XkD1acbS03m2MxHmZdBaE+BCIb4M1iM"
                + "+hYd4Sz1oV9KgiAP90mPQSg128g688R6ZI6G2+mMGwykfdrzVUWgs7/DnsMWLYtljMshGDHMdYv4MBAH9nROrYPO1sN4qMITVT+O9Vz2ezo5CG"
                + "+qvs1XkCGa7oI6A6CRrKgVBXtlcZHueWV2vckq1G0j0WGhm8cIFf17/wb"
                + "+eAysl9rC8E4qDC5rheTzuwpsYnQgaWtaKksql4MFbpAgMBAAECggEAW6fFvLG1WZGsIM0gheQth8Cwz29/7Njwz"
                + "+zcf9PeOFmdmRA1GBkQhOgDnw87ZywD4ooH82XCwfdfglb+c0VZhqrd5shPWEgnYNgP5NKJjveNQxd4WBHhBr5RUMqMT+K1VNAoe82TcVj"
                + "+teVjlUFbjBHOq/KUtnD5Q1jnE5rTzZXz+pzFCPeSstrT1yby2EyO6zNfWAkG6eturdCMGfX/EKptXPTfZhNylvKgopK30m9hNJ"
                + "/HkbszJ3OEW38tsPwu3DcKP7FgBsUoM1hWiWRyKXVQyQMftW0O6SwZN/M/Ac9OzL/ZDeFQnpA30WgOi5Do"
                + "/Ca1l6ZdgljWw9dXVl7CAQKBgQD3GeAlunI8iPR3N/kwZfU2yyIOAA"
                +
                "+XYZvLX7PQ1J4z1GJ5M5SlWe54E6ZRljd0eKqLZ1KqnqY0YXQaGQz6JD85G7WkCEnhYkWLfaEXnrLenKxPhpMpO2gGTo9QkbUKIsPdmYoA8WTSEm0BmvZXw36t56IMzGdQQuTmeew5KO9gKQKBgQCHqonPPavdldy29SVGneJvo4H2KchqhX/584Cr5F4ulUJeIst49cpWjKdWhZaEJkkkzgKHy2T5zze3WayUh3lzsJ+bTytGN7TxiDwFKmro0i7TrEGYmQVw5uJMjwCREHIC0Lgv6alPYuMPdkAbHSc+dVt8U3t1ArINAI4nl60YwQKBgQCf+nKyOnnHU2vi26xLd1dA+Fa99bAidCFnlDhY1a7vI2v1yD1OqGDKAP7HB5gzogPYaTaOHFTCyO1gECPktx7vnE8HOg6LCxK3csifADISCiFNA3W3VizNGIOUyCELxOJGUCeW4LJDh4Znaapfu8QCV1sFKjkhL43+4aTchPIlsQKBgEi/m0yFLo8RGJ0HUejPKyhgToV5HF56ngijmcETIanrIf6mu+NuMgU9QVJ1KiRM/3X7/oFhARGwG5l3PcMb7nWqJbw7tOHfZ2kJe93tRAz7AF9DhJ1WmQNU287f9BbV8b0uvUX8D21hgo69A11Gwc+NUPSXM6GoQ2AThycV/51BAoGAKTvB+gVmkuEUxwGgmOKOd6FaveOnaN/VgJQbA2V1GSDb8igKk3/PrMGq6BWDUlWvSrpTRpsXAtQlnYjaPClz+F1EqJHd+vS95DH9rBF5ZDI/q1mNTsKE2PDRa3kmUj2hVdKEtx2gC3uJDZcW28uSqxbXVyyk7c3Dp4eL/RQkOl0=";
    }
}