package com.custodix.insite.local.ehr2edc.mongo.app.review.provenance;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ReviewedProvenanceVitalSignDocumentObjectMother {
	public static final LocalDateTime DIABP_TIMESTAMP = LocalDateTime.of(2019, 7, 8, 13, 35);
	public static final String DIABP_CODE = "271650006";
	public static final String DIABP_COMPONENT = "DIABP";
	public static final String DIABP_LOCATION_ARM = "40983000";
	public static final String DIABP_POSITION_SITTING = "33586001";
	public static final String DIABP_LATERALITY_LEFT = "7771000";
	public static final BigDecimal DIABP_VALUE = new BigDecimal("70.0");
	public static final BigDecimal DIABP_LLN = new BigDecimal("60.0");
	public static final BigDecimal DIABP_ULN = new BigDecimal("90.0");
	public static final String DIABP_UNIT = "mm[Hg]";

	public static ReviewedProvenanceVitalSignDocument diastolicBloodPressureProvenance() {
		return ReviewedProvenanceVitalSignDocument.newBuilder()
				.withConcept(ReviewedVitalSignConceptDocument.newBuilder()
						.withConcept(ReviewedConceptCodeDocument.of(DIABP_CODE))
						.withComponent(DIABP_COMPONENT)
						.withLocation(DIABP_LOCATION_ARM)
						.withLaterality(DIABP_LATERALITY_LEFT)
						.withPosition(DIABP_POSITION_SITTING)
						.build())
				.withEffectiveDateTime(DIABP_TIMESTAMP)
				.withMeasurement(ReviewedMeasurementDocument.newBuilder()
						.withLowerLimit(DIABP_LLN)
						.withUpperLimit(DIABP_ULN)
						.withValue(DIABP_VALUE)
						.withUnit(DIABP_UNIT)
						.build())
				.build();
	}
}
