package tv.teads.github.api.model.webhook

import io.circe.generic.semiauto._

import tv.teads.github.api.model._

trait DeploymentStatusPayloadCodec {
  self: UserCodec with RepositoryCodec with TeamCodec ⇒

  implicit lazy val deploymentStatusPayloadDecoder = deriveFor[DeploymentStatusPayload].decoder
}
case class DeploymentStatusPayload(
  team:         Team,
  repository:   Repository,
  organization: Option[User],
  sender:       User
) extends Payload
