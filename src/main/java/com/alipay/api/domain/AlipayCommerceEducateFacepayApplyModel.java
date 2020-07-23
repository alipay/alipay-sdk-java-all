package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸开通支付申请
 *
 * @author auto create
 * @since 1.0, 2020-07-21 16:23:23
 */
public class AlipayCommerceEducateFacepayApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4356822118784873817L;

	/**
	 * 扩展信息, json格式. 例如, 对不使用银行优先代扣, 可以传入{"useBankChannel":"NO"}
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 采集人脸学生uid
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
	 * 学生所在学校外标(国标码)
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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
