package com.app.nrisamajuser.utility;

import android.util.Patterns;

/**
 * Created by shivlab-android on 1/8/17.
 */

public class ValidationUtils {

    public static boolean isEmpty(String data) {
        if (data == null) {
            return true;
        }
        if (data.trim().equals("")) {
            return true;
        }
        return false;
    }

    /**
     * Check Mail Is Valid Or Not
     *
     * @param email
     * @return
     */
    public static boolean isValidEmail(String email) {
        // TODO Auto-generated method stub

        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return true;
        }
        return false;
    }

    /**
     * Check Phone Is Valid Or Not
     *
     * @param phone
     * @return
     */
    public static boolean isValidPhone(String phone) {
        // TODO Auto-generated method stub

        if (Patterns.PHONE.matcher(phone).matches()) {
            return true;
        }

        return false;
    }
    public static int length(final CharSequence s) {
        return s == null ? 0 : s.length();
    }


}
