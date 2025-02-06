package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸开通支付申请
 *
 * @author auto create
 * @since 1.0, 2024-11-15 13:08:58
 */
public class AlipayCommerceEducateFacepayApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2276418582232155782L;

	/**
	 * 扩展信息，json格式。 例如：
● 默认不传，兜底为{"useBankChannel":"YES","useBankMode":"BANK"}
● 不使用银行代扣, {"useBankChannel":"NO"}
● 使用银行代扣且指定银行(parentPhone/openAssetRole/cardHolderName可选，建议提供)，{"useBankChannel":"YES","useBankMode":"BANK","parentPhone":"13212345678","openAssetRole":"CHILD","cardHolderName":"张三"} 
● 使用银行代扣且指定银行卡(parentPhone/openAssetRole/cardHolderName可选，建议提供)，{"useBankChannel":"YES","useBankMode":"BANK_CARD","cardNo":"4340627330268609","parentPhone":"13212345678","openAssetRole":"CHILD","cardHolderName":"张三"}
● 使用银行代扣且指定数币，{"useBankChannel":"YES","useBankMode":"DCEP"}
● 使用银行代扣且指定数币编号，{"useBankChannel":"YES","useBankMode":"DCEP_CARD","cardNo":"00123445678951302"}。
● 使用银行代扣切指定BIN（cardNo为银行识别码；openAssetRole为开通资产角色，可选的有「CHILD：孩子，PARENT：家长」；【可选】cardHolderName为持卡人姓名），{"useBankChannel":"YES","useBankMode":"BIN","cardNo":"123456","openAssetRole":"CHILD","cardHolderName":"张三"}
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
