package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.crowd.count response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceCrowdCountResponse extends AlipayResponse {

	private static final long serialVersionUID = 5651441312587311218L;

	/** 
	 * 返回一组规则的人群数量
	 */
	@ApiListField("crowd_count")
	@ApiField("number")
	private List<Long> crowdCount;

	public void setCrowdCount(List<Long> crowdCount) {
		this.crowdCount = crowdCount;
	}
	public List<Long> getCrowdCount( ) {
		return this.crowdCount;
	}

}
