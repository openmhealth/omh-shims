/*
 * Copyright 2014 Open mHealth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openmhealth.schema.pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;
import org.openmhealth.schema.pojos.generic.TimeFrame;

/**
 *
 * @author Fara Kahir
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = Wellbeing.SCHEMA_WELLBEING, namespace = "omh:normalized")
public class Wellbeing extends BaseDataPoint {
    
    @JsonProperty(value = "wellbeing_measure", required = true)
    private WellbeingMeasure wellbeingMeasure;

    @JsonProperty(value = "effective_time_frame", required = false)
    private TimeFrame effectiveTimeFrame;


    public static final String SCHEMA_WELLBEING = "wellbeing";
    
    public Wellbeing() {
    }
    
    @Override
    @JsonIgnore
    public String getSchemaName() {
        return SCHEMA_WELLBEING;
    }

    @Override
    @JsonIgnore
    public DateTime getTimeStamp() {
        return effectiveTimeFrame.getTimestamp();
    }

    public WellbeingMeasure getWellbeingMeasure() {
        return wellbeingMeasure;
    }

    public void setWellbeingMeasure(WellbeingMeasure wellbeingMeasure) {
        this.wellbeingMeasure = wellbeingMeasure;
    }
    
    public TimeFrame getEffectiveTimeFrame() {
        return effectiveTimeFrame;
    }

    public void setEffectiveTimeFrame(TimeFrame effectiveTimeFrame) {
        this.effectiveTimeFrame = effectiveTimeFrame;
    }
    
}
