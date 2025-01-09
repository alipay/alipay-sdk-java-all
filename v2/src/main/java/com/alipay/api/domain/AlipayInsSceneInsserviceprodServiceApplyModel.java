package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构同步蚂蚁服务订单创建接口
 *
 * @author auto create
 * @since 1.0, 2023-10-17 10:09:54
 */
public class AlipayInsSceneInsserviceprodServiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6721771799542417417L;

	/**
	 * 蚂蚁的服务合约编号，通知蚂蚁生成服务订单时，需指定为哪个合约号生成订单
	 */
	@ApiField("ant_contract_no")
	private String antContractNo;

	/**
	 * 服务订单类型；枚举（ISSUE，USE，REFUND，SURRENDER）
	 */
	@ApiField("apply_order_type")
	private String applyOrderType;

	/**
	 * 本字段是一个String类型的JSON，用于机构通知蚂蚁生成服务订单时，传入额外参数
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 机构侧创建此订单的时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 外部业务号，服务商的服务订单号（幂等key）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAntContractNo() {
		return this.antContractNo;
	}
	public void setAntContractNo(String antContractNo) {
		this.antContractNo = antContractNo;
	}

	public String getApplyOrderType() {
		return this.applyOrderType;
	}
	public void setApplyOrderType(String applyOrderType) {
		this.applyOrderType = applyOrderType;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
