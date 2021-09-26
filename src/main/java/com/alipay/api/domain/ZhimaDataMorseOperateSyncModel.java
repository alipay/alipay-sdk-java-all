package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安全计算操作信息同步
 *
 * @author auto create
 * @since 1.0, 2018-01-17 10:33:43
 */
public class ZhimaDataMorseOperateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1425426383217574411L;

	/**
	 * 外部商户发送给域内系统的信息
	 */
	@ApiField("data")
	private String data;

	/**
	 * 扩展字段，用于补充
	 */
	@ApiField("extent_info")
	private String extentInfo;

	/**
	 * 多方安全计算分配给商户的唯一id，由管理员分配给商户的唯一识别号；
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 服务操作类型，商户同步信息到域内，类型枚举：revoke_dataset、public_dataset、approve_sercive；根据不同场景管理员分配；
	 */
	@ApiField("operate_type")
	private String operateType;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getExtentInfo() {
		return this.extentInfo;
	}
	public void setExtentInfo(String extentInfo) {
		this.extentInfo = extentInfo;
	}

	public String getMid() {
		return this.mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
