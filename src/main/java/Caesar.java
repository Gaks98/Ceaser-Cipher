public class Caesar {
        private String mPlainText;
        private int mShift;

        public int getShift() {
                return mShift;               
        }
        public String getText() {
                return mPlainText;
        }
        public Caesar(String text,int shift) {
                mPlainText = text;
                mShift = shift;
        }
        public static String encrypt(Caesar caesar) {
                if (caesar.mShift > 26) {
                        caesar.mShift = caesar.mShift % 26;
                } else if (caesar.mShift < 0) {
                        caesar.mShift = (caesar.mShift % 26) + 26;
                }
                String cipherText = "";
                int length = caesar.mPlainText.length();
                for (int i = 0; i < length; i++) {
                        char ch = caesar.mPlainText.charAt(i);
                        if (Character.isLetter(ch)) {
                                if (Character.isLowerCase(ch)) {
                                        char c = (char)(ch + caesar.mShift);
                                        if (c > 'z') {
                                                cipherText += (char)(ch - (26 - caesar.mShift));
                                        } else {
                                                cipherText += c;
                                        }
                                }
                                if (Character.isUpperCase(ch)) {
                                        char c = (char)(ch + caesar.mShift);
                                        if (c > 'Z') {
                                                cipherText += (char)(ch - (26 - caesar.mShift));
                                        } else {
                                                cipherText += c;
                                        }
                                }
                        } else {
                                cipherText += ch;
                        }
                }

                return cipherText;
        }

        public static String decrypt(Caesar caesar) {
                if (caesar.mShift > 26) {
                        caesar.mShift = caesar.mShift % 26;
                } else if (caesar.mShift < 0) {
                        caesar.mShift = (caesar.mShift % 26) + 26;
                }
                String cipherText = "";
                int length = caesar.mPlainText.length();
                for (int i = 0; i < length; i++) {
                        char ch = caesar.mPlainText.charAt(i);
                        if (Character.isLetter(ch)) {
                                if (Character.isLowerCase(ch)) {
                                        char c = (char)(ch - caesar.mShift);
                                        if (c < 'a') {
                                                cipherText += (char)(ch + (26 - caesar.mShift));
                                        } else {
                                                cipherText += c;
                                        }
                                }
                                if (Character.isUpperCase(ch)) {
                                        char c = (char)(ch - caesar.mShift);
                                        if (c < 'A') {
                                                cipherText += (char)(ch + (26 - caesar.mShift));
                                        } else {
                                                cipherText += c;
                                        }
                                }
                        } else {
                                cipherText += ch;
                        }
                }

                return cipherText;
        }

}