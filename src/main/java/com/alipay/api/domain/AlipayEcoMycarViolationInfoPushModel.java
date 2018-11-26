package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV推送新违章信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:47
 */
public class AlipayEcoMycarViolationInfoPushModel extends AlipayObject {

	private static final long serialVersionUID = 6878955752891959359L;

	/**
	 * 1:可在线处理, 2:不可在线处理, 3:需查询确定
	 */
	@ApiField("deal_type")
	private String dealType;

	/**
	 * 暂无
	 */
	@ApiField("push_type")
	private String pushType;

	/**
	 * 违章地点
	 */
	@ApiField("vi_address")
	private String viAddress;

	/**
	 * 违章罚款金额
	 */
	@ApiField("vi_fine")
	private String viFine;

	/**
	 * 是否已处理, 0:已处理，1:未处理
	 */
	@ApiField("vi_handled")
	private String viHandled;

	/**
	 * 车牌号
	 */
	@ApiField("vi_number")
	private String viNumber;

	/**
	 * 违章扣分
	 */
	@ApiField("vi_point")
	private String viPoint;

	/**
	 * 违章时间(yyyyMMddhhmmss)
	 */
	@ApiField("vi_time")
	private Date viTime;

	/**
	 * 违章行为
	 */
	@ApiField("vi_type")
	private String viType;

	public String getDealType() {
		return this.dealType;
	}
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	public String getPushType() {
		return this.pushType;
	}
	public void setPushType(String pushType) {
		this.pushType = pushType;
	}

	public String getViAddress() {
		return this.viAddress;
	}
	public void setViAddress(String viAddress) {
		this.viAddress = viAddress;
	}

	public String getViFine() {
		return this.viFine;
	}
	public void setViFine(String viFine) {
		this.viFine = viFine;
	}

	public String getViHandled() {
		return this.viHandled;
	}
	public void setViHandled(String viHandled) {
		this.viHandled = viHandled;
	}

	public String getViNumber() {
		return this.viNumber;
	}
	public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}

	public String getViPoint() {
		return this.viPoint;
	}
	public void setViPoint(String viPoint) {
		this.viPoint = viPoint;
	}

	public Date getViTime() {
		return this.viTime;
	}
	public void setViTime(Date viTime) {
		this.viTime = viTime;
	}

	public String getViType() {
		return this.viType;
	}
	public void setViType(String viType) {
		this.viType = viType;
	}

}
