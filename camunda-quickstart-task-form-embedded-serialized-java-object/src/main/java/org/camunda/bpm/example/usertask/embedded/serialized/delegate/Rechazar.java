
package org.camunda.bpm.example.usertask.embedded.serialized.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


/**
 * @author Carlos
 *
 */
public class Rechazar implements JavaDelegate {

  public void execute(DelegateExecution execution) throws Exception {

   System.out.println("rechazado");

  }

}
