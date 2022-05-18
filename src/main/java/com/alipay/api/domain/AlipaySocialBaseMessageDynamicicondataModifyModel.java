package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用中心-微动效-数据管理服务
 *
 * @author auto create
 * @since 1.0, 2022-01-10 10:44:52
 */
public class AlipaySocialBaseMessageDynamicicondataModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6819587969424515366L;

	/**
	 * 微动效业务编码
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 微动效数据
	 */
	@ApiField("op_data")
	private SingleDynamicData opData;

	/**
	 * 操作类型：
ADD-新增数据
DEL-删除数据
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public SingleDynamicData getOpData() {
		return this.opData;
	}
	public void setOpData(SingleDynamicData opData) {
		this.opData = opData;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
