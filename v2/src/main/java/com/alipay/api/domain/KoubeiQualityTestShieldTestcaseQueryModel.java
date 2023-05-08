package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询测试场景用例
 *
 * @author auto create
 * @since 1.0, 2020-01-08 15:13:52
 */
public class KoubeiQualityTestShieldTestcaseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5367922565394118141L;

	/**
	 * 接口支持两种维度的查询
1 测试集维度，如果想查询测试集，biz_id输入测试集id
2 测试用例维度，如果想查询测试用例，biz_id输入测试

单个查询（单个id  EG:123）
多个查询（多个id  EG:123,321）
全部查询（全部id  EG:ALL）
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 测试集维度：COLLECTION_TYPE
测试用例维度：CASE_TYPE
全部数据：ALL
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 参数名：isv名称 应用场景：isv需要输入自己的名称，用来查询当前isv下的测试用例
	 */
	@ApiField("isv_name")
	private String isvName;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

}
