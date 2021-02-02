package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DrawndnVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.drawndnlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEcapiprodDrawndnDrawndnlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4524384229391623974L;

	/** 
	 * 支用列表
	 */
	@ApiListField("drawndn_list")
	@ApiField("drawndn_vo")
	private List<DrawndnVo> drawndnList;

	/** 
	 * 唯一一次请求标示
	 */
	@ApiField("request_id")
	private String requestId;

	public void setDrawndnList(List<DrawndnVo> drawndnList) {
		this.drawndnList = drawndnList;
	}
	public List<DrawndnVo> getDrawndnList( ) {
		return this.drawndnList;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
