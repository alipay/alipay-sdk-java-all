package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取云凤蝶站点页面预览数据返回值模型
 *
 * @author auto create
 * @since 1.0, 2018-05-17 16:00:41
 */
public class FengdiePreviewQueryRespModel extends AlipayObject {

	private static final long serialVersionUID = 1229523352815885128L;

	/**
	 * 云凤蝶页面预览数据列表
	 */
	@ApiListField("list")
	@ApiField("fengdie_preview_pages_model")
	private List<FengdiePreviewPagesModel> list;

	public List<FengdiePreviewPagesModel> getList() {
		return this.list;
	}
	public void setList(List<FengdiePreviewPagesModel> list) {
		this.list = list;
	}

}
