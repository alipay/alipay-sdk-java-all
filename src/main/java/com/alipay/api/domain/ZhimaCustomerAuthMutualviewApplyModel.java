package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用互查申请
 *
 * @author auto create
 * @since 1.0, 2018-10-25 11:42:44
 */
public class ZhimaCustomerAuthMutualviewApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4555321122325552547L;

	/**
	 * 当前业务操作是查询自己还是查询别人的芝麻分，接口提供方分配的值：
self ：标识查询自己的分数或者做业务授权时也需要传入此值
other ： 标识需要查询别人的分数
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 商户回调的url，业务操作完成后会在此url上追加返回参数
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 用户传递扩展类的信息，例如传入当前用户的logo，昵称等，用于业务页面上的展示，此值为一个Map类型的json串字符，传入规则如下：
{"key1":"val2","key2":"val2"}
	 */
	@ApiField("ext_biz_param")
	private String extBizParam;

	/**
	 * 个人身份信息入参：
1. 若做业务授权请求请传入身份三要素，如下：
 {"certType":"IDENTITY_CARD","name":"张三","certNo":"654326198805xxxx9"}
2. 若为查询自己或者别人的信用状态，请传入userId，如下：
{"userId":"2088xxxx281848"}

针对各个字段的描述如下：
certType:证件类型固定为身份证，传入IDENTITY_CARD；
name:用户姓名，如张三
certNo:身份证号码
userId:此值为查询时的必要入参，此值的来源为授权完成后返回的auth_id字段，可以参见接口返回值中的出参
	 */
	@ApiField("identity_param")
	private String identityParam;

	/**
	 * 当前业务产品的产品码，接口提供方分配，填写的值即是示例值中的值
	 */
	@ApiField("product_param")
	private String productParam;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getExtBizParam() {
		return this.extBizParam;
	}
	public void setExtBizParam(String extBizParam) {
		this.extBizParam = extBizParam;
	}

	public String getIdentityParam() {
		return this.identityParam;
	}
	public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}

	public String getProductParam() {
		return this.productParam;
	}
	public void setProductParam(String productParam) {
		this.productParam = productParam;
	}

}
