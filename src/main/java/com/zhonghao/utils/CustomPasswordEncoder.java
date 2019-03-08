package com.zhonghao.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author ：hao
 * @date ：Created in 3/8/2019 4:33 PM
 */
public class CustomPasswordEncoder implements PasswordEncoder {
  @Override
  public String encode(CharSequence charSequence) {
    return charSequence.toString();
  }

  @Override
  public boolean matches(CharSequence charSequence, String s) {
    return s.equals(charSequence.toString());
  }
}
