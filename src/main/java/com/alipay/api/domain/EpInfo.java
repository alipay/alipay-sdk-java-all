package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业征信基本信息
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:33:12
 */
public class EpInfo extends AlipayObject {

	private static final long serialVersionUID = 8379278114326718277L;

	/**
	 * 企业征信元素列表，如一套企业工商照面信息。数据长度不定。
	 */
	@ApiListField("ep_element_list")
	@ApiField("ep_element")
	private List<EpElement> epElementList;

	public List<EpElement> getEpElementList() {
		return this.epElementList;
	}
	public void setEpElementList(List<EpElement> epElementList) {
		this.epElementList = epElementList;
	}

}
