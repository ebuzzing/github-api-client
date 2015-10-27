package tv.teads.github.api.model.webhook

import io.circe.generic.semiauto._

import tv.teads.github.api.model._

trait GollumPayloadCodec {
  self: UserCodec with RepositoryCodec with TeamCodec ⇒

  implicit lazy val gollumPayloadDecoder = deriveFor[GollumPayload].decoder
}
case class GollumPayload(
  team:         Team,
  repository:   Repository,
  organization: Option[User],
  sender:       User
) extends Payload
