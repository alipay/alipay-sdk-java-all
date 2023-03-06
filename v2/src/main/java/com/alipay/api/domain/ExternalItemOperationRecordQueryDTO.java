package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商品操作记录查询请求模型
 *
 * @author auto create
 * @since 1.0, 2022-12-09 16:20:55
 */
public class ExternalItemOperationRecordQueryDTO extends AlipayObject {

	private static final long serialVersionUID = 3283319615864425831L;

	/**
	 * 支付宝的服务产品编号
	 */
	@ApiField("ant_ser_prod_no")
	private String antSerProdNo;

	/**
	 * 扩展字段。注意：本字段是一个String类型的JSON
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 完成时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * 触发时间
	 */
	@ApiField("init_time")
	private Date initTime;

	/**
	 * 机构商品编码
	 */
	@ApiField("merchant_item_code")
	private String merchantItemCode;

	/**
	 * 药品操作记录编号
(唯一标识当前药品操作记录)
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 药品操作类型。
MAJOR 主要信息;
EXT 扩展信息;
UP 上架;
DOWN 下架商品
	 */
	@ApiField("refresh_type")
	private String refreshType;

	/**
	 * 状态。
PROCESSING  执行中，
SUCCESS 成功，
FAIL 执行失败
	 */
	@ApiField("status")
	private String status;

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

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Date getInitTime() {
		return this.initTime;
	}
	public void setInitTime(Date initTime) {
		this.initTime = initTime;
	}

	public String getMerchantItemCode() {
		return this.merchantItemCode;
	}
	public void setMerchantItemCode(String merchantItemCode) {
		this.merchantItemCode = merchantItemCode;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRefreshType() {
		return this.refreshType;
	}
	public void setRefreshType(String refreshType) {
		this.refreshType = refreshType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
