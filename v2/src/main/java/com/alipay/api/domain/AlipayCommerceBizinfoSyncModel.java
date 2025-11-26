package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资讯同步接口
 *
 * @author auto create
 * @since 1.0, 2023-04-06 14:26:32
 */
public class AlipayCommerceBizinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3755232584361952452L;

	/**
	 * 商户标识，由支付宝分配
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 资讯唯一标识
	 */
	@ApiField("biz_info_id")
	private String bizInfoId;

	/**
	 * 资讯的业务时间，如房产交易资讯的交易时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 主体单元信息，如社区房价咨询填写社区信息
	 */
	@ApiField("biz_unit_info")
	private BizUnit bizUnitInfo;

	/**
	 * 房产交易信息
	 */
	@ApiField("house_biz_info")
	private HouseBizInfo houseBizInfo;

	/**
	 * 资讯类型
	 */
	@ApiField("info_type")
	private String infoType;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizInfoId() {
		return this.bizInfoId;
	}
	public void setBizInfoId(String bizInfoId) {
		this.bizInfoId = bizInfoId;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public BizUnit getBizUnitInfo() {
		return this.bizUnitInfo;
	}
	public void setBizUnitInfo(BizUnit bizUnitInfo) {
		this.bizUnitInfo = bizUnitInfo;
	}

	public HouseBizInfo getHouseBizInfo() {
		return this.houseBizInfo;
	}
	public void setHouseBizInfo(HouseBizInfo houseBizInfo) {
		this.houseBizInfo = houseBizInfo;
	}

	public String getInfoType() {
		return this.infoType;
	}
	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}

}
