package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸开通支付申请
 *
 * @author auto create
 * @since 1.0, 2023-07-05 15:12:15
 */
public class AlipayCommerceEducateFacepayApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3519668123498475136L;

	/**
	 * 扩展信息, json格式. 例如, 对不使用银行代扣, 可以传入{"useBankChannel":"NO"}；
使用银行代扣且指定银行，{"useBankChannel":"YES","useBankMode":"BANK"}；
使用银行代扣且指定银行卡，{"useBankChannel":"YES","useBankMode":"BANK_CARD"}。且必须实现获取银行卡信息的SPIAPI，若不传useBankMode默认指定银行
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
