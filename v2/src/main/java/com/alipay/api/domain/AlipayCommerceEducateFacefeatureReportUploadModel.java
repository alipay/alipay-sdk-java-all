package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸特征报告上传
 *
 * @author auto create
 * @since 1.0, 2021-07-23 15:20:19
 */
public class AlipayCommerceEducateFacefeatureReportUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8125316766424613889L;

	/**
	 * 参数来源 客户端BehaviourLog-> aesCypher 参数
	 */
	@ApiField("aes_cypher")
	private String aesCypher;

	/**
	 * 参数来源 客户端BehaviourLog->imageBlob 参数
	 */
	@ApiField("auth_img")
	private String authImg;

	/**
	 * 学校团餐
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 商户机具编码即机具sn号
	 */
	@ApiField("device_num")
	private String deviceNum;

	/**
	 * 国家统一分配的学校社会信用代码(institution_id)
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 必须是由支付宝业务方分配的英文简称(例如:yikeshixx),不能是中文
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 没有特殊情况固定传internal+alipay+atomicZolozBio+faceFeature
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 商户透传人脸客户端信息json格式字符串， 参数来源 客户端BehaviourLog-> logBlob 参数
	 */
	@ApiField("z_face_info")
	private String zFaceInfo;

	public String getAesCypher() {
		return this.aesCypher;
	}
	public void setAesCypher(String aesCypher) {
		this.aesCypher = aesCypher;
	}

	public String getAuthImg() {
		return this.authImg;
	}
	public void setAuthImg(String authImg) {
		this.authImg = authImg;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getDeviceNum() {
		return this.deviceNum;
	}
	public void setDeviceNum(String deviceNum) {
		this.deviceNum = deviceNum;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getzFaceInfo() {
		return this.zFaceInfo;
	}
	public void setzFaceInfo(String zFaceInfo) {
		this.zFaceInfo = zFaceInfo;
	}

}
