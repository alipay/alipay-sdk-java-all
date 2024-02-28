package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货柜商品自助上新信息同步
 *
 * @author auto create
 * @since 1.0, 2023-10-09 20:17:51
 */
public class AlipayMsaasMediarecogMmportalCvgoodsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6689149933169696919L;

	/**
	 * 上新申请ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 信息审核日期，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("audit_time")
	private Date auditTime;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商品属性信息
	 */
	@ApiField("goods_info")
	private CVGoodsInfo goodsInfo;

	/**
	 * 商品识别类型，枚举值
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 商户名称，填PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public Date getAuditTime() {
		return this.auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public CVGoodsInfo getGoodsInfo() {
		return this.goodsInfo;
	}
	public void setGoodsInfo(CVGoodsInfo goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	public String getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

}
