package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 增值服务进度同步接口
 *
 * @author auto create
 * @since 1.0, 2023-11-07 20:22:53
 */
public class AlipayInsSceneInsserviceprodSerprogressSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8228897482134981368L;

	/**
	 * 蚂蚁服务合约编号
	 */
	@ApiField("ant_ser_contract_no")
	private String antSerContractNo;

	/**
	 * 蚂蚁服务产品号
	 */
	@ApiField("ant_ser_prod_no")
	private String antSerProdNo;

	/**
	 * 扩展信息，JSON字符串格式。该接口为通用接口，需要和增值服务中台的开发同学根据不同的业务约定不同的字段。
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 状态变更时间
	 */
	@ApiField("change_time")
	private Date changeTime;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 服务业务单号
	 */
	@ApiField("ser_biz_no")
	private String serBizNo;

	/**
	 * 服务业务类型
	 */
	@ApiField("ser_biz_type")
	private String serBizType;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getAntSerContractNo() {
		return this.antSerContractNo;
	}
	public void setAntSerContractNo(String antSerContractNo) {
		this.antSerContractNo = antSerContractNo;
	}

	public String getAntSerProdNo() {
		return this.antSerProdNo;
	}
	public void setAntSerProdNo(String antSerProdNo) {
		this.antSerProdNo = antSerProdNo;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public Date getChangeTime() {
		return this.changeTime;
	}
	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSerBizNo() {
		return this.serBizNo;
	}
	public void setSerBizNo(String serBizNo) {
		this.serBizNo = serBizNo;
	}

	public String getSerBizType() {
		return this.serBizType;
	}
	public void setSerBizType(String serBizType) {
		this.serBizType = serBizType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
