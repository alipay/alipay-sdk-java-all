package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家人群信息 
-注意：商家会员专用，禁止滥用，因模型升级造成的兼容性问题，后果自负
 *
 * @author auto create
 * @since 1.0, 2023-06-10 21:54:40
 */
public class QipanMerchantCrowd extends AlipayObject {

	private static final long serialVersionUID = 3293721569616166656L;

	/**
	 * 安全应用范围，参考文档 <a href="https://opendocs.alipay.com/pre-open/04phhq" target="_blank">安全应用范围枚举</a>
	 */
	@ApiListField("apply_channel_list")
	@ApiField("string")
	private List<String> applyChannelList;

	/**
	 * 支付宝人群code
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 人群描述
	 */
	@ApiField("crowd_desc")
	private String crowdDesc;

	/**
	 * 人群名称
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 由于法务合规要求，仅能展示人群规模的范围。
	 */
	@ApiField("crowd_size")
	private String crowdSize;

	/**
	 * 商户外部用户人群code 用于标识商家人群，需保证同一商户下crowd_code唯一
	 */
	@ApiField("external_crowd_code")
	private String externalCrowdCode;

	/**
	 * 人群是否可见,取值如下：
<li>0-人群可见，默认为0</li>
<li>1-人群不可见</li>
	 */
	@ApiField("hidden")
	private String hidden;

	/**
	 * true - 人群支持标签二次加工
false - 人群不支持标签二次加工
	 */
	@ApiField("processable")
	private Boolean processable;

	/**
	 * INIT-初始化中
EFFECTIVE-生效
INEFFECTIVE-失效
	 */
	@ApiField("status")
	private String status;

	public List<String> getApplyChannelList() {
		return this.applyChannelList;
	}
	public void setApplyChannelList(List<String> applyChannelList) {
		this.applyChannelList = applyChannelList;
	}

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public String getCrowdDesc() {
		return this.crowdDesc;
	}
	public void setCrowdDesc(String crowdDesc) {
		this.crowdDesc = crowdDesc;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public String getCrowdSize() {
		return this.crowdSize;
	}
	public void setCrowdSize(String crowdSize) {
		this.crowdSize = crowdSize;
	}

	public String getExternalCrowdCode() {
		return this.externalCrowdCode;
	}
	public void setExternalCrowdCode(String externalCrowdCode) {
		this.externalCrowdCode = externalCrowdCode;
	}

	public String getHidden() {
		return this.hidden;
	}
	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	public Boolean getProcessable() {
		return this.processable;
	}
	public void setProcessable(Boolean processable) {
		this.processable = processable;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
