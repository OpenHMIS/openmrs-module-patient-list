/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and
 * limitations under the License.
 *
 * Copyright (C) OpenHMIS.  All Rights Reserved.
 */
package org.openmrs.module.patientlist.api.model;

import org.openmrs.OpenmrsData;
import org.openmrs.Patient;
import org.openmrs.module.openhmis.commons.api.f.Func1;

/**
 * Model class that represents an patient information field.
 */
public class PatientInformationField<T extends OpenmrsData, E> extends AbstractPatientListField<T, E> {

	public PatientInformationField(
	    String prefix, String name, Class<?> dataType, Class<T> entityType,
	    Func1<T, Object> valueFunc, String mappingFieldName) {
		setPrefix(prefix);
		setName(name);
		setDataType(dataType);
		setValueFunc(valueFunc);
		setEntityType(entityType);
		if (mappingFieldName != null) {
			setMappingField(new PatientListMappingField<T>(mappingFieldName, entityType));
		}
	}
}
