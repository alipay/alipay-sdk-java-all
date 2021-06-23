package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流水查询
 *
 * @author auto create
 * @since 1.0, 2021-04-27 23:58:35
 */
public class AlipayAssetPointVoucherprodAssetbillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7418565153592198568L;

	/**
	 * 资产id，要查询流水的模版id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产类型，要创建的资产的类型，BENEFIT_TEMPLATE表示权益模板，由支付宝权益结算平台定义
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 业务号，需要查询的流水所对应的上游业务系统流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务类型：
BENEFIT_TEMPLATE_RECHARGE: 创建模版
BENEFIT_TEMPLATE_RECYCLE: 模版回收
BENEFIT_TEMPLATE_SETTLE: 结算
BENEFIT_TEMPLATE_APPEND: 追加
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 要查询的流水的最晚业务时间
	 */
	@ApiField("end_biz_dt")
	private Date endBizDt;

	/**
	 * 流水页码，不传时默认为1
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 流水分页大小，不传时默认10
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 开始时间，要查询的流水的最早业务时间
	 */
	@ApiField("start_biz_dt")
	private Date startBizDt;

	/**
	 * 支付宝会员id，资产所属用户的支付宝会员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Date getEndBizDt() {
		return this.endBizDt;
	}
	public void setEndBizDt(Date endBizDt) {
		this.endBizDt = endBizDt;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public Date getStartBizDt() {
		return this.startBizDt;
	}
	public void setStartBizDt(Date startBizDt) {
		this.startBizDt = startBizDt;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
