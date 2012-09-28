/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.swarmnet.shawn;

public class EventScheduler {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected EventScheduler(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EventScheduler obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      ShawnJNI.delete_EventScheduler(swigCPtr);
    }
    swigCPtr = 0;
  }

  public static SWIGTYPE_p_shawn__EventScheduler__EventInfo getNO_EVENT() {
    long cPtr = ShawnJNI.EventScheduler_NO_EVENT_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_shawn__EventScheduler__EventInfo(cPtr, false);
  }

  public EventScheduler() {
    this(ShawnJNI.new_EventScheduler(), true);
  }

  public SWIGTYPE_p_shawn__EventScheduler__EventInfo new_event(SWIGTYPE_p_shawn__EventScheduler__EventHandler eh, double t, SWIGTYPE_p_shawn__RefcntPointerTshawn__EventTag_t eth) {
    long cPtr = ShawnJNI.EventScheduler_new_event(swigCPtr, SWIGTYPE_p_shawn__EventScheduler__EventHandler.getCPtr(eh), t, SWIGTYPE_p_shawn__RefcntPointerTshawn__EventTag_t.getCPtr(eth));
    return (cPtr == 0) ? null : new SWIGTYPE_p_shawn__EventScheduler__EventInfo(cPtr, false);
  }

  public void delete_event(SWIGTYPE_p_shawn__EventScheduler__EventInfo arg0) {
    ShawnJNI.EventScheduler_delete_event(swigCPtr, SWIGTYPE_p_shawn__EventScheduler__EventInfo.getCPtr(arg0));
  }

  public void move_event(SWIGTYPE_p_shawn__EventScheduler__EventInfo arg0, double arg1) {
    ShawnJNI.EventScheduler_move_event(swigCPtr, SWIGTYPE_p_shawn__EventScheduler__EventInfo.getCPtr(arg0), arg1);
  }

  public double current_time() {
    return ShawnJNI.EventScheduler_current_time(swigCPtr);
  }

  public double next_event_time() {
    return ShawnJNI.EventScheduler_next_event_time(swigCPtr);
  }

  public boolean empty() {
    return ShawnJNI.EventScheduler_empty(swigCPtr);
  }

  public SWIGTYPE_p_shawn__EventScheduler__EventInfo front_w() {
    long cPtr = ShawnJNI.EventScheduler_front_w(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_shawn__EventScheduler__EventInfo(cPtr, false);
  }

  public SWIGTYPE_p_shawn__EventScheduler__EventInfo front() {
    long cPtr = ShawnJNI.EventScheduler_front(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_shawn__EventScheduler__EventInfo(cPtr, false);
  }

  public void playback(double stop_time) {
    ShawnJNI.EventScheduler_playback(swigCPtr, stop_time);
  }

  public void clear(double new_time) {
    ShawnJNI.EventScheduler_clear__SWIG_0(swigCPtr, new_time);
  }

  public void clear() {
    ShawnJNI.EventScheduler_clear__SWIG_1(swigCPtr);
  }

}