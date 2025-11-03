# Unified Inbox Project

This project is a full-stack application for team-based customer engagement. It provides a unified inbox for managing communication across multiple channels, including SMS, WhatsApp, and optional email and social media platforms.

## Features

- **Unified Inbox**: Aggregate messages from multiple channels into a single view.
- **Team Collaboration**: Real-time presence, inline mentions, and shared notes.
- **Analytics Dashboard**: Track engagement metrics like response times and open rates.
- **Channel Integrations**: Twilio for SMS/WhatsApp, optional email and social media APIs.
- **Contact Management**: Unified schema with history tracking and duplicate merging.
- **Scheduling**: Automate follow-ups and message sending.

## Tech Stack

- **Frontend/Backend**: Next.js 14+ with TypeScript
- **Database**: PostgreSQL via Prisma ORM
- **Authentication**: Better Auth with role-based access
- **Styling**: Tailwind CSS
- **Integrations**: Twilio SDK, optional Resend, Twitter API, Facebook Graph API

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd unified-inbox
   ```
3. Install dependencies:
   ```bash
   npm install
   ```
4. Set up the database:
   ```bash
   npx prisma init
   ```
5. Start the development server:
   ```bash
   npm run dev
   ```

## Folder Structure

- `src/`: Contains the source code for the application.
- `prisma/`: Database schema and migrations.
- `public/`: Static assets.
- `README.md`: Project documentation.

## Contribution

Feel free to submit issues and pull requests. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License.
