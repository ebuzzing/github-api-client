package tv.teads.github.api.services

import tv.teads.github.api.BaseSpec

import scala.concurrent.ExecutionContext.Implicits.global

class ReleaseServiceSpec extends BaseSpec {

  "Release Service" should "be able to fetch TeadsSDK-android releases" in {

    whenReady(teadsClient.releases.list("TeadsSDK-android")) { list ⇒
      list should not be empty
    }
  }
  it should "be able to fetch TeadsSDK-android release 2406019" in {

    whenReady(teadsClient.releases.get("TeadsSDK-android", 2406019)) { list ⇒
      list should not be empty
    }
  }
  it should "be able to fetch TeadsSDK-android latest release" in {

    whenReady(teadsClient.releases.getLatest("TeadsSDK-android")) { list ⇒
      list should not be empty
    }
  }
  it should "be able to fetch TeadsSDK-android release by tag v1.6.5" in {

    whenReady(teadsClient.releases.getByTag("TeadsSDK-android", "v1.6.5")) { list ⇒
      list should not be empty
    }
  }
  it should "be able to fetch TeadsSDK-android release 2406019 assets" in {

    whenReady(teadsClient.releases.listAssets("TeadsSDK-android", 2406019)) { list ⇒
      list should not be empty
    }
  }
  it should "be able to fetch TeadsSDK-android release asset 1200000" in {

    whenReady(teadsClient.releases.getAsset("TeadsSDK-android", 1200000)) { list ⇒
      list should not be empty
    }
  }

}
