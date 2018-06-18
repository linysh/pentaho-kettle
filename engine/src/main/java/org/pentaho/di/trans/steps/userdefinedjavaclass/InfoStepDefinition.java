/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2018 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.trans.steps.userdefinedjavaclass;

import org.pentaho.di.core.injection.Injection;
import org.pentaho.di.trans.step.StepMeta;

public class InfoStepDefinition extends StepDefinition {
  @Injection( name = "INFO_TAG", group = "INFO_STEPS" )
  public String tag = super.tag;
  @Injection( name = "INFO_STEP_NAME", group = "INFO_STEPS" )
  public String stepName = super.stepName;
  public StepMeta stepMeta = super.stepMeta;
  @Injection( name = "INFO_DESCRIPTION", group = "INFO_STEPS" )
  public String description = super.description;

  public InfoStepDefinition() {
    super();
  }

  public InfoStepDefinition( String tag, String stepName, StepMeta stepMeta, String description ) {
    super( tag, stepName, stepMeta, description );
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
