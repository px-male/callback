/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbacktest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katsubehiroshi
 */
public class Bar {
     List<CallbackInterface> callbackList = new ArrayList<CallbackInterface>();
     
     
  void addCallback(CallbackInterface callback) {
    callbackList.add(callback);
  }

  public void execute() {
    for (CallbackInterface callback: callbackList) {
      callback.doCallback();
    }
  }
}

