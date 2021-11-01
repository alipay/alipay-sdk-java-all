package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核身相关通用类查询
 *
 * @author auto create
 * @since 1.0, 2021-03-10 11:27:15
 */
public class AlipaySecurityRiskVerifyidentityCommonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6776174298769214988L;

	/**
	 * 根据不同的值选择查询接口的查询类型：
TB_BIOPAY_MENU代表查询手淘中用户的生物支付开通数据
	 */
	@ApiField("cq_type")
	private String cqType;

	/**
	 * {
  "uidType":"taobao",
  "viData": {
    "bmi": "3.60.0:13434331200,32774,2088612430858603",
    "sfp": "true",
    "secData": {
      "rt": "0",
      "ap": "",
      "pn": "com.alipay.iphoneclient",
      "bi": "4#1#2#0#2#1#0#6#0#1#0;",
      "dv": "17",
      "ai": "2#2#0#2#1#0#6;",
      "pm": "iPhone11#8",
      "di": "FFFFFFFF2E0DEBB9ECF34D9C8F666C7C560B1F1C"
    },
    "dm": "iPhone11,8",
    "viv": "3.1.85.100",
    "tid": "89b7b78a10b4bc31ebf62a314b791dbf3ce6cf7538aaca3049a4cde35d792985",
    "deviceType":"android/ios"
  }
}
	 */
	@ApiField("env_data")
	private String envData;

	/**
	 * 支付宝uid或者手淘uid，根据类型可以传入不同的值
	 */
	@ApiField("user_id")
	private String userId;

	public String getCqType() {
		return this.cqType;
	}
	public void setCqType(String cqType) {
		this.cqType = cqType;
	}

	public String getEnvData() {
		return this.envData;
	}
	public void setEnvData(String envData) {
		this.envData = envData;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
