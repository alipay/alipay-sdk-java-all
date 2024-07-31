package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阅读听书频道专辑信息同步接口
 *
 * @author auto create
 * @since 1.0, 2024-06-17 15:16:18
 */
public class AlipayUserAntbooksAlbumSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7862424669813357971L;

	/**
	 * 专辑整体时长，单位秒
	 */
	@ApiField("album_duration")
	private Long albumDuration;

	/**
	 * 专辑是否已完结。
	 */
	@ApiField("album_finished")
	private Boolean albumFinished;

	/**
	 * 专辑是否免费，免费专辑下所有声音应都可免费畅听。
	 */
	@ApiField("album_free")
	private Boolean albumFree;

	/**
	 * 专辑ID，在合作方侧应唯一对应一个专辑。
	 */
	@ApiField("album_id")
	private String albumId;

	/**
	 * 专辑是否可对用户展示商业化广告，默认不可展示。
true：允许展示；false：不允许展示；
	 */
	@ApiField("album_show_ad")
	private Boolean albumShowAd;

	/**
	 * 专辑主播人，有则必填。
	 */
	@ApiField("announcer")
	private String announcer;

	/**
	 * 专辑作者名，有则必填。
	 */
	@ApiField("author")
	private String author;

	/**
	 * 专辑简介信息，对C端用户展示。
	 */
	@ApiField("brief")
	private String brief;

	/**
	 * 专辑所属类目名称列表，层级关系使用-隔开
	 */
	@ApiListField("category_list")
	@ApiField("string")
	private List<String> categoryList;

	/**
	 * 版权类型，有则传入。
	 */
	@ApiField("copyright_type")
	private String copyrightType;

	/**
	 * 专辑原图URL地址，要求图片为方图，尺寸540*540
	 */
	@ApiField("cover_url")
	private String coverUrl;

	/**
	 * 专辑封面大图，要求图片为方图，尺寸400*400
	 */
	@ApiField("cover_url_big")
	private String coverUrlBig;

	/**
	 * 专辑封面中图，要求图片为方图，尺寸288*288
	 */
	@ApiField("cover_url_middle")
	private String coverUrlMiddle;

	/**
	 * 专辑封面小图，要求图片为方图，尺寸140*140
	 */
	@ApiField("cover_url_small")
	private String coverUrlSmall;

	/**
	 * 专辑面世时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 拓展信息List，内部为AlbumExtInfo对象，其中包含两个字段key及value，以此实现业务上的Map<String, String>
	 */
	@ApiListField("ext_info_list")
	@ApiField("album_ext_info")
	private List<AlbumExtInfo> extInfoList;

	/**
	 * 专辑名称，用于对C端用户展示。
	 */
	@ApiField("name")
	private String name;

	/**
	 * ADD：新增专辑录入
UPDATE：专辑（包含声音）的信息变更
DELETE：专辑下架
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 专辑热度信息，有则传入
	 */
	@ApiField("popularity_info")
	private AlbumPopularityInfo popularityInfo;

	/**
	 * 专辑价格信息，收费专辑必填
	 */
	@ApiField("price_info")
	private AlbumPriceInfo priceInfo;

	/**
	 * 专辑营销活动信息，有则传入
	 */
	@ApiField("promo_info")
	private AlbumPromoInfo promoInfo;

	/**
	 * 专辑推荐理由，有则填入。
	 */
	@ApiField("recommend_reason")
	private String recommendReason;

	/**
	 * 专辑内声音列表
	 */
	@ApiListField("sound_list")
	@ApiField("album_sound_info")
	private List<AlbumSoundInfo> soundList;

	/**
	 * 专辑标签列表
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 目标人群标签
	 */
	@ApiListField("target_crowd_tags")
	@ApiField("string")
	private List<String> targetCrowdTags;

	/**
	 * 专辑在合作方侧最近更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	public Long getAlbumDuration() {
		return this.albumDuration;
	}
	public void setAlbumDuration(Long albumDuration) {
		this.albumDuration = albumDuration;
	}

	public Boolean getAlbumFinished() {
		return this.albumFinished;
	}
	public void setAlbumFinished(Boolean albumFinished) {
		this.albumFinished = albumFinished;
	}

	public Boolean getAlbumFree() {
		return this.albumFree;
	}
	public void setAlbumFree(Boolean albumFree) {
		this.albumFree = albumFree;
	}

	public String getAlbumId() {
		return this.albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public Boolean getAlbumShowAd() {
		return this.albumShowAd;
	}
	public void setAlbumShowAd(Boolean albumShowAd) {
		this.albumShowAd = albumShowAd;
	}

	public String getAnnouncer() {
		return this.announcer;
	}
	public void setAnnouncer(String announcer) {
		this.announcer = announcer;
	}

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBrief() {
		return this.brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}

	public List<String> getCategoryList() {
		return this.categoryList;
	}
	public void setCategoryList(List<String> categoryList) {
		this.categoryList = categoryList;
	}

	public String getCopyrightType() {
		return this.copyrightType;
	}
	public void setCopyrightType(String copyrightType) {
		this.copyrightType = copyrightType;
	}

	public String getCoverUrl() {
		return this.coverUrl;
	}
	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public String getCoverUrlBig() {
		return this.coverUrlBig;
	}
	public void setCoverUrlBig(String coverUrlBig) {
		this.coverUrlBig = coverUrlBig;
	}

	public String getCoverUrlMiddle() {
		return this.coverUrlMiddle;
	}
	public void setCoverUrlMiddle(String coverUrlMiddle) {
		this.coverUrlMiddle = coverUrlMiddle;
	}

	public String getCoverUrlSmall() {
		return this.coverUrlSmall;
	}
	public void setCoverUrlSmall(String coverUrlSmall) {
		this.coverUrlSmall = coverUrlSmall;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<AlbumExtInfo> getExtInfoList() {
		return this.extInfoList;
	}
	public void setExtInfoList(List<AlbumExtInfo> extInfoList) {
		this.extInfoList = extInfoList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public AlbumPopularityInfo getPopularityInfo() {
		return this.popularityInfo;
	}
	public void setPopularityInfo(AlbumPopularityInfo popularityInfo) {
		this.popularityInfo = popularityInfo;
	}

	public AlbumPriceInfo getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(AlbumPriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}

	public AlbumPromoInfo getPromoInfo() {
		return this.promoInfo;
	}
	public void setPromoInfo(AlbumPromoInfo promoInfo) {
		this.promoInfo = promoInfo;
	}

	public String getRecommendReason() {
		return this.recommendReason;
	}
	public void setRecommendReason(String recommendReason) {
		this.recommendReason = recommendReason;
	}

	public List<AlbumSoundInfo> getSoundList() {
		return this.soundList;
	}
	public void setSoundList(List<AlbumSoundInfo> soundList) {
		this.soundList = soundList;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getTargetCrowdTags() {
		return this.targetCrowdTags;
	}
	public void setTargetCrowdTags(List<String> targetCrowdTags) {
		this.targetCrowdTags = targetCrowdTags;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
