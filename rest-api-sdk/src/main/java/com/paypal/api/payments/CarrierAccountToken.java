package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.Getter; import lombok.Setter;

@Getter @Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CarrierAccountToken extends PayPalModel {

	/**
	 * ID of a previously saved carrier account resource.
	 */
	private String carrierAccountId;

	/**
	 * The unique identifier of the payer used when saving this carrier account instrument.
	 */
	private String externalCustomerId;

	/**
	 * Default Constructor
	 */
	public CarrierAccountToken() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CarrierAccountToken(String carrierAccountId, String externalCustomerId) {
		this.carrierAccountId = carrierAccountId;
		this.externalCustomerId = externalCustomerId;
	}
}
