package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PointTransInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.equity.instpoint.trans.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:02:41
 */
public class AntfortuneEquityInstpointTransQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1645132459714593975L;

	/** 
	 * 查询到的结果
	 */
	@ApiListField("trans_info")
	@ApiField("point_trans_info")
	private List<PointTransInfo> transInfo;

	public void setTransInfo(List<PointTransInfo> transInfo) {
		this.transInfo = transInfo;
	}
	public List<PointTransInfo> getTransInfo( ) {
		return this.transInfo;
	}

}
