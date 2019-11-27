package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * seq-test
 *
 * @author auto create
 * @since 1.0, 2018-09-06 15:50:46
 */
public class AlipaySecurityProdSeqQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3249979923297235241L;

	/**
	 * 64
	 */
	@ApiField("id")
	private String id;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
