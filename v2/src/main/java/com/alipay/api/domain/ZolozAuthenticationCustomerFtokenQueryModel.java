package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸ftoken查询消费接口
 *
 * @author auto create
 * @since 1.0, 2024-06-18 14:10:52
 */
public class ZolozAuthenticationCustomerFtokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1188514372892351882L;

	/**
	 * 1、1：1人脸验证能力
2、1：n人脸搜索能力（支付宝uid入库）
3、1：n人脸搜索能力（支付宝手机号入库）
4、手机号和人脸识别综合能力
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 人脸产品拓展参数
	 */
	@ApiField("ext_info")
	private FaceExtInfo extInfo;

	/**
	 * 人脸token
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 刷脸初始化流程中产生的zimId值
	 */
	@ApiField("zim_id")
	private String zimId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public FaceExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(FaceExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

	public String getZimId() {
		return this.zimId;
	}
	public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
