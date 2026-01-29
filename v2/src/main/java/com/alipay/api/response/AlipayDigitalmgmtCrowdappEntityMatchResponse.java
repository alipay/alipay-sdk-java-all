package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.crowdapp.entity.match response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-29 10:47:41
 */
public class AlipayDigitalmgmtCrowdappEntityMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 6572344424249162694L;

	/** 
	 * null
	 */
	@ApiListField("hit_crowd_app_ids")
	@ApiField("string")
	private List<String> hitCrowdAppIds;

	/** 
	 * null
	 */
	@ApiListField("not_hit_crowd_app_ids")
	@ApiField("string")
	private List<String> notHitCrowdAppIds;

	public void setHitCrowdAppIds(List<String> hitCrowdAppIds) {
		this.hitCrowdAppIds = hitCrowdAppIds;
	}
	public List<String> getHitCrowdAppIds( ) {
		return this.hitCrowdAppIds;
	}

	public void setNotHitCrowdAppIds(List<String> notHitCrowdAppIds) {
		this.notHitCrowdAppIds = notHitCrowdAppIds;
	}
	public List<String> getNotHitCrowdAppIds( ) {
		return this.notHitCrowdAppIds;
	}

}
