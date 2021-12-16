package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 间连天梭绑定接口
 *
 * @author auto create
 * @since 1.0, 2021-06-17 10:40:43
 */
public class AntMerchantExpandIndirectTiansuoBindModel extends AlipayObject {

	private static final long serialVersionUID = 7438855441928585374L;

	/**
	 * 间连天梭绑定isv列表
	 */
	@ApiListField("tiansuo_isv_bind_list")
	@ApiField("tiansuo_isv_bind_v_o")
	private List<TiansuoIsvBindVO> tiansuoIsvBindList;

	public List<TiansuoIsvBindVO> getTiansuoIsvBindList() {
		return this.tiansuoIsvBindList;
	}
	public void setTiansuoIsvBindList(List<TiansuoIsvBindVO> tiansuoIsvBindList) {
		this.tiansuoIsvBindList = tiansuoIsvBindList;
	}

}
