package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物业社区通知通告详细信息.
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:18:37
 */
public class CplifeNoticeDetail extends AlipayObject {

	private static final long serialVersionUID = 8452511993781927716L;

	/**
	 * 通告公告的具体内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 通知的下线时间.
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 通知公告中允许出现的图片列表。
	 */
	@ApiListField("image_list")
	@ApiField("cplife_notice_img")
	private List<CplifeNoticeImg> imageList;

	/**
	 * 通知的上线时间，该时刻之后，用户才能在支付宝客户端看到该通知。
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 通知是否置顶，默认为false.
	 */
	@ApiField("stickied")
	private Boolean stickied;

	/**
	 * 通知(公告)的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 通告公告的具体类型.通知：“01” ,公告：“02”
	 */
	@ApiField("type")
	private String type;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<CplifeNoticeImg> getImageList() {
		return this.imageList;
	}
	public void setImageList(List<CplifeNoticeImg> imageList) {
		this.imageList = imageList;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Boolean getStickied() {
		return this.stickied;
	}
	public void setStickied(Boolean stickied) {
		this.stickied = stickied;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
