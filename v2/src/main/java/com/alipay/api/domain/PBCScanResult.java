package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人行制裁扫描返回结果
 *
 * @author auto create
 * @since 1.0, 2026-04-14 19:12:45
 */
public class PBCScanResult extends AlipayObject {

	private static final long serialVersionUID = 8881267634168893788L;

	/**
	 * null
	 */
	@ApiListField("hit_details")
	@ApiField("p_b_c_hit_detail")
	private List<PBCHitDetail> hitDetails;

	public List<PBCHitDetail> getHitDetails() {
		return this.hitDetails;
	}
	public void setHitDetails(List<PBCHitDetail> hitDetails) {
		this.hitDetails = hitDetails;
	}

}
