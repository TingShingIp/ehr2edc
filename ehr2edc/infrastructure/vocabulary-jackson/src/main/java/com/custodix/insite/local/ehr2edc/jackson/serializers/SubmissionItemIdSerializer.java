package com.custodix.insite.local.ehr2edc.jackson.serializers;

import com.custodix.insite.local.ehr2edc.vocabulary.SubmittedItemId;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public final class SubmissionItemIdSerializer extends StdSerializer<SubmittedItemId> {
	public SubmissionItemIdSerializer() {
		this(null);
	}

	private SubmissionItemIdSerializer(Class<SubmittedItemId> t) {
		super(t);
	}

	@Override
	public void serialize(SubmittedItemId value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
		jgen.writeString(value.getId());
	}
}
