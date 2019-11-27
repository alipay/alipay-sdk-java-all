package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * lingsilingliu
 *
 * @author auto create
 * @since 1.0, 2017-04-08 12:53:54
 */
public class AlipayOpenServicemarketLingsilingliuLingsilingliuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7571197951527492223L;

	/**
	 * 12
	 */
	@ApiListField("lingsilingliu")
	@ApiField("string")
	private List<String> lingsilingliu;

	public List<String> getLingsilingliu() {
		return this.lingsilingliu;
	}
	public void setLingsilingliu(List<String> lingsilingliu) {
		this.lingsilingliu = lingsilingliu;
	}

}
