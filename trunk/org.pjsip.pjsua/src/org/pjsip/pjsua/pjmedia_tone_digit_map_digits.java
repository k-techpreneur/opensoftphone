/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.36
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjmedia_tone_digit_map_digits {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjmedia_tone_digit_map_digits(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjmedia_tone_digit_map_digits obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      pjsuaJNI.delete_pjmedia_tone_digit_map_digits(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setDigit(char value) {
    pjsuaJNI.pjmedia_tone_digit_map_digits_digit_set(swigCPtr, this, value);
  }

  public char getDigit() {
    return pjsuaJNI.pjmedia_tone_digit_map_digits_digit_get(swigCPtr, this);
  }

  public void setFreq1(short value) {
    pjsuaJNI.pjmedia_tone_digit_map_digits_freq1_set(swigCPtr, this, value);
  }

  public short getFreq1() {
    return pjsuaJNI.pjmedia_tone_digit_map_digits_freq1_get(swigCPtr, this);
  }

  public void setFreq2(short value) {
    pjsuaJNI.pjmedia_tone_digit_map_digits_freq2_set(swigCPtr, this, value);
  }

  public short getFreq2() {
    return pjsuaJNI.pjmedia_tone_digit_map_digits_freq2_get(swigCPtr, this);
  }

  public pjmedia_tone_digit_map_digits() {
    this(pjsuaJNI.new_pjmedia_tone_digit_map_digits(), true);
  }

}
