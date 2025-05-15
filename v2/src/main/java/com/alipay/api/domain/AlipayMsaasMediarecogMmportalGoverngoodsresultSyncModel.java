package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 接收行业商品治理结果
 *
 * @author auto create
 * @since 1.0, 2025-04-02 11:00:54
 */
public class AlipayMsaasMediarecogMmportalGoverngoodsresultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1348129128578679885L;

	/**
	 * 算法ID
	 */
	@ApiField("algorithm_id")
	private String algorithmId;

	/**
	 * 检查信息，checkSuccess为false时有数据，代表哪个地方需要治理以及治理结果
	 */
	@ApiListField("check_message")
	@ApiField("govern_goods_check_message")
	private List<GovernGoodsCheckMessage> checkMessage;

	/**
	 * 检查是否通过
	 */
	@ApiField("check_success")
	private Boolean checkSuccess;

	/**
	 * 请求ID
	 */
	@ApiField("req_id")
	private String reqId;

	public String getAlgorithmId() {
		return this.algorithmId;
	}
	public void setAlgorithmId(String algorithmId) {
		this.algorithmId = algorithmId;
	}

	public List<GovernGoodsCheckMessage> getCheckMessage() {
		return this.checkMessage;
	}
	public void setCheckMessage(List<GovernGoodsCheckMessage> checkMessage) {
		this.checkMessage = checkMessage;
	}

	public Boolean getCheckSuccess() {
		return this.checkSuccess;
	}
	public void setCheckSuccess(Boolean checkSuccess) {
		this.checkSuccess = checkSuccess;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

}
