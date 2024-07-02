package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸开通支付申请
 *
 * @author auto create
 * @since 1.0, 2024-06-18 16:10:16
 */
public class AlipayCommerceEducateFacepayApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7285452899969958375L;

	/**
	 * 扩展信息，json格式。 例如：
● 默认不传，兜底为{"useBankChannel":"YES","useBankMode":"BANK"}
● 不使用银行代扣, {"useBankChannel":"NO"}
● 使用银行代扣且指定银行(parentPhone可选，建议提供)，{"useBankChannel":"YES","useBankMode":"BANK","parentPhone":"13212345678"} 
● 使用银行代扣且指定银行卡(parentPhone可选，建议提供)，{"useBankChannel":"YES","useBankMode":"BANK_CARD","cardNo":"4340627330268609","parentPhone":"13212345678"}
● 使用银行代扣且指定数币，{"useBankChannel":"YES","useBankMode":"DCEP"}
● 使用银行代扣且指定数币编号，{"useBankChannel":"YES","useBankMode":"DCEP_CARD","cardNo":"00123445678951302"}。
如果指定银行卡但未提供cardNo，必须实现获取银行卡信息的SPIAPI。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 刷脸用户openId
	 */
	@ApiField("face_open_id")
	private String faceOpenId;

	/**
	 * 刷脸用户id
	 */
	@ApiField("face_uid")
	private String faceUid;

	/**
	 * 接入场景，可选项：
K12   --  K12场景
COLLEGE  --  高校场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 学校外标
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFaceOpenId() {
		return this.faceOpenId;
	}
	public void setFaceOpenId(String faceOpenId) {
		this.faceOpenId = faceOpenId;
	}

	public String getFaceUid() {
		return this.faceUid;
	}
	public void setFaceUid(String faceUid) {
		this.faceUid = faceUid;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

}
