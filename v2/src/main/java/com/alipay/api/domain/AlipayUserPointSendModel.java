package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户积分发放接口（需要授权）
 *
 * @author auto create
 * @since 1.0, 2019-07-22 11:00:23
 */
public class AlipayUserPointSendModel extends AlipayObject {

	private static final long serialVersionUID = 7243812147633962821L;

	/**
	 * 扩展信息，用于对该笔业务调用的补充说明
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部业务流水号，长度请务必保证28位，会用于幂等性校验，所以请保证每次请求的业务流水号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 需要给用户发放的积分数
	 */
	@ApiField("point")
	private String point;

	/**
	 * 调用方自己的业务场景类型标识，用户区分调用方和业务，请根据自己的业务来传
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPoint() {
		return this.point;
	}
	public void setPoint(String point) {
		this.point = point;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
